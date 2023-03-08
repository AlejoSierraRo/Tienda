package tienda.apitienda.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tienda.apitienda.modelo.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {
    
}
