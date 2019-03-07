package com.qy.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "city", schema = "wang")
public class CityEntity implements Serializable {
    private int id;
    private String code;
    private String name;
   /* private String provincecode;*/
    //一对多
    private Set<AreaEntity> areaEntities;
    //多对一
    private ProvinceEntity provinceEntity;
    @OneToMany(cascade = CascadeType.ALL ,targetEntity = AreaEntity.class)
    @JoinColumn(name = "citycode" , referencedColumnName = "code")
    public Set<AreaEntity> getAreaEntities() {
        return areaEntities;
    }

    public void setAreaEntities(Set<AreaEntity> areaEntities) {
        this.areaEntities = areaEntities;
    }
    @ManyToOne(targetEntity = ProvinceEntity.class)
    @JoinColumn(name = "provincecode" ,referencedColumnName = "code")
    public ProvinceEntity getProvinceEntity() {
        return provinceEntity;
    }

    public void setProvinceEntity(ProvinceEntity provinceEntity) {
        this.provinceEntity = provinceEntity;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    /*  @Basic
    @Column(name = "provincecode")
  public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (id != that.id) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (provincecode != null ? !provincecode.equals(that.provincecode) : that.provincecode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (provincecode != null ? provincecode.hashCode() : 0);
        return result;
    }
}
