package com.grupo3.aplicacion_csi.controller.api;

import com.grupo3.aplicacion_csi.model.bo.TipoObra;
import com.grupo3.aplicacion_csi.model.dao.TipoObraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tipo_obra")
@RestController
public class TipoObraController {

    @Autowired
    TipoObraDAO tipoObraDAO;

    @GetMapping("/")
    public List<TipoObra> get(){
        return tipoObraDAO.get();
    }

    @GetMapping("/find/{id}")
    public TipoObra findOne(@PathVariable("id") Long id){
        return tipoObraDAO.findOne(id);
    }

    @PostMapping("/create")
    public TipoObra create(@ModelAttribute TipoObra tipoObra){
        long id = tipoObraDAO.create(tipoObra);
        tipoObra.setIdTipoObra(id);
        return tipoObra;
    }

    @PutMapping("/update")
    public TipoObra update(@ModelAttribute TipoObra tipoObra){
        tipoObraDAO.update(tipoObra);
        return tipoObra;
    }

    @DeleteMapping("/delete/{id}")
    public boolean Delete(@PathVariable("id") Long id){
        return tipoObraDAO.delete(id);
    }

}
