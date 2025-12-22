package com.exercise.platos.service;

import com.exercise.platos.dto.IngredienteDTO;
import com.exercise.platos.dto.PlatoDTO;
import com.exercise.platos.model.Ingrediente;
import com.exercise.platos.model.Plato;
import com.exercise.platos.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private IPlatoRepository iPlatoRepository;

    @Autowired
    private RestTemplate ingredientsApi;

    @Override
    public String savePlato(PlatoDTO platoDTO) {

        Plato plato = new Plato();
        String nombrePlato = platoDTO.getNombre();

        //buscar ingredientes que conforman este plato
        List<IngredienteDTO> listaIngredientes = (List<IngredienteDTO>) ingredientsApi.getForObject("http://localhost:9003/ingredientes/traer/" + nombrePlato, ));
        if (listaIngredientes != null) {

                List<String> nombresIngredientes = new ArrayList<>();
                System.out.println(listaIngredientes.size());
                System.out.println("NOMBRE INGREDIENTE:        ------");
                System.out.println(listaIngredientes.get(0).getClass());

                for (IngredienteDTO ingrediente : listaIngredientes) {
                    System.out.println("NOMBRE INGREDIENTE:        ------");
                    System.out.println(ingrediente.getNombre_ingrediente());
                    nombresIngredientes.add(ingrediente.getNombre_ingrediente());
                }

                plato.setNombre(platoDTO.getNombre());
                plato.setPrecio(platoDTO.getPrecio());
                plato.setDescripcion(platoDTO.getDescripcion());
                plato.setIngredienteList(nombresIngredientes);
                iPlatoRepository.save(plato);
                 return "El plato se guardo correctamente y logramos asignarle su lista de ingredientes";
        }

        plato.setNombre(platoDTO.getNombre());
        plato.setPrecio(platoDTO.getPrecio());
        plato.setDescripcion(platoDTO.getDescripcion());
        iPlatoRepository.save(plato);
        return "El plato se guardo correctamente sin embargo no encontramos ingredientes para este plato en particular";
    }
}
  /*  private Plato setearDatos(PlatoDTO platoDTO, List<IngredienteDTO> listaIngredientes) {
        Plato plato = new Plato();
        List<String> nombresIngredientes = new ArrayList<>();

        for(IngredienteDTO ingrediente : listaIngredientes ){
            nombresIngredientes.add(ingrediente.getNombre_ingrediente());
        }

        if(listaIngredientes == null){
            plato.setNombre(platoDTO.getNombre());
            plato.setPrecio(platoDTO.getPrecio());
            plato.setDescripcion(platoDTO.getDescripcion());
            plato.setIngredienteList(nombresIngredientes);
            return plato;
        }
        plato.setNombre(platoDTO.getNombre());
        plato.setPrecio(platoDTO.getPrecio());
        plato.setDescripcion(platoDTO.getDescripcion());
        return plato;
    }
}*/
