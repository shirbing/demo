package com.qy.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "province", schema = "wang")
public class ProvinceEntity implements Serializable {
    private int id;
    private String code;
    @OneToMany(cascade = CascadeType.ALL ,targetEntity = CityEntity.class)
    @JoinColumn(name = "provincecode" , referencedColumnName = "code")
    public Set<CityEntity> getCitys() {
        return citys;
    }

    public void setCitys(Set<CityEntity> citys) {
        this.citys = citys;
    }

    private String name;
    //一对多
    private Set<CityEntity> citys;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvinceEntity that = (ProvinceEntity) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
