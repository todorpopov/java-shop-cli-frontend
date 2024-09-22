package shop.data.dtos;

public class ShopDTO {
    private Long id;
    private String name;

    public ShopDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    } 

    public String getName() {
        return this.name;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String toString() {
        return String.format("Shop - id: %d , name: %s", id, name);
    }
}
