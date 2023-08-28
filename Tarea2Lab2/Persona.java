import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	public ArrayList<Persona> amigos = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void agregarPersona(Persona personaNueva) {
		amigos.add(personaNueva);
		System.out.println(personaNueva.getNombre() + " nuevo amigo agregado.");
	}

	public Persona buscarPersona(String nombre) {
		for (Persona amigo : amigos) {
			if (amigo.getNombre().equals(nombre)) {
				return amigo;
			}
		}
		return null;
	}

	public void eliminarPersona(Persona personaDelete) {
		if (amigos.contains(personaDelete)) {
			amigos.remove(personaDelete);
			System.out.println(personaDelete.getNombre() + " amigo eliminado.");
		} else {
			System.out.println(personaDelete.getNombre() + " amigo no encontrado.");
		}
	}
}