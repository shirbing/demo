package com.qy.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "area", schema = "wang")
public class AreaEntity  implements Serializable {
    private int id;
    private String code;
    private String name;
    /*private String citycode;*/
    private CityEntity cityEntity;
    @ManyToOne(targetEntity = CityEntity.class)
    @JoinColumn(name = "citycode" ,referencedColumnName = "code")
    public CityEntity getCityEntity() {
        return cityEntity;
    }

    public void setCityEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Basic
    @Column(name = "citycode")
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AreaEntity that = (AreaEntity) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (citycode != null ? !citycode.equals(that.citycode) : that.citycode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (citycode != null ? citycode.hashCode() : 0);
        return result;
    }
}
