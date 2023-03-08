package tienda.apitienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tienda.apitienda.modelo.Pais;
import tienda.apitienda.repositorio.PaisRepositorio;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    private PaisRepositorio repositorio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return repositorio.findAll();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable Long id) {
        return repositorio.findById(id).get();
    }

}
