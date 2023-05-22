package com.sdia.radar_microservice.RestFullControllers;

import com.sdia.radar_microservice.entities.Radar;
import com.sdia.radar_microservice.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")  //declarer le root de URL

public class RadarController {
    //Declaration d'objet repository
    @Autowired
    RadarRepository radarRepository;

    //select method :
    /** remarque : ("/enetityA+s) -> Ex : "/radars" , "radars"**/
    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }

    @GetMapping("/radars/{id}")
    public Radar getOneRadar(@PathVariable long id){
        return radarRepository.findById(id).get();
    }


    //Insert method :
    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        System.out.println(">> [Inserting Radar] : "+radar.toString());
        return radarRepository.save(radar);
    }


    //Update method :
    @PutMapping("/radars/{id}")
    public Radar updateRadar(@RequestBody Radar radar, @PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet radar se trouve dans le corps de request http

        radar.setId(id); //l'objet radar chargé dans la requet est déja modifié il faut juste l'inserer dans bdd.
        return radarRepository.save(radar);
    }

    //Delete method :
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable long id){
        //PathVariable signifie que le para id se trouve dans URL request http
        //RequestBody signifie que l'objet radar se trouve dans le corps de request http

        radarRepository.deleteById(id);
        System.out.println(">> [Deleting Radar]: Radar [ID = "+id+" ] has been deleted successfuly !");
    }


    @GetMapping("/AA")
    public String getsA(){
        return "<h3><b>hola</b></h3>"+
                "\n <h1>Welcome to my Radar Micro-service</h1>";
    }
}
