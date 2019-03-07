package com.qy.domain;



import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="city",schema="wang")

public class City {

    private int id;
    private String code;
    private String name;

    Set<Area> areas=new HashSet<>();
//    private String provincecode;
    //省级对象 多对一关联
    private Province province;

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="")
    public Set<Area> getAreas() {
        return areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }*/

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (code != null ? !code.equals(city.code) : city.code != null) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        if (provincecode != null ? !provincecode.equals(city.provincecode) : city.provincecode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (provincecode != null ? provincecode.hashCode() : 0);
        return result;
    }*/
}
