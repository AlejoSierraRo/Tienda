package tiendavideo.apitiendavideo.modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fechaprestamo")
    private Date fechaPrestamo;

    @Column(name = "fechadevolucion")
    private Date fechaDevolucion;

    @Column(name = "plazo")
    private int plazo;

    @Column(name = "precio")
    private int precio;

    @ManyToOne 
    @JoinColumn(name = "idinventario", referencedColumnName = "id")
    private Inventario inventario;

    @ManyToOne 
    @JoinColumn(name = "idtercero", referencedColumnName = "id")
    private Tercero tercero;
   

    

    
    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Date getfechaPrestamo() {

        return fechaPrestamo;
    }

    public void setfechaPrestamo(Date fechaPrestamo) {

        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getfechaDevolucion() {

        return fechaDevolucion;
    }

    public void setfechaDevolucion(Date fechaDevolucion) {

        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }


}
