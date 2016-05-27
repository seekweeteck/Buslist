package my.edu.tarc.buslist;

/**
 * Created by KweeTeck on 5/26/2016.
 */
public class Point {
    private Integer id;
    private Double lat, lon;
    private String name;
    private Integer type;

    public Point() {
    }

    public Point(Integer id, Double lat, Double lon, String name, Integer type) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
