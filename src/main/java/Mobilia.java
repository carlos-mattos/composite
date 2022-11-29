public class Mobilia {

    private Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMaterial() {
        if (this.material == null) {
            throw new NullPointerException("Mobilia sem material");
        }
        return this.material.getMaterial();
    }

}
