package entidades;
public class producto implements Comparable<producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    public producto() {
    }

    public producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro + '}';
    }

    @Override
    public int compareTo(producto t) {   
        if(this.codigo == t.codigo){
            return 0;
        }else if(this.codigo > t.codigo){
            return 1;
        }else{
            return -1;
        }
    }
}
