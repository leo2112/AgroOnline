package co.udea.AgroOnline.dto;

@Entity
@Table(name = persona)
public class Persona {
    @Id
    @GeneratedValue(strategy = Generationatype.IDENTITY)
    @Colum(name = "id")
    private Long id;

    @Colum(name = "nombre")
    private String nombre;

    @Colum(name = "apellido")
    private String apellido;

    @Colum(name = "telefono")
    private String telefono;

    @Colum(name = "direccion")
    private String direccion;

    @Colum(name = "email")
    public String email;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

