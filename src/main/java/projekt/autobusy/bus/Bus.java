package projekt.autobusy.bus;

import projekt.autobusy.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "buses")
public class Bus extends BaseEntity {
    @Column(name = "bus_model")
    @NotEmpty
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
