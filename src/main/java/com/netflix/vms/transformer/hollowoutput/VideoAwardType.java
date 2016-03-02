package com.netflix.vms.transformer.hollowoutput;


public class VideoAwardType implements Cloneable {

    public int id = java.lang.Integer.MIN_VALUE;
    public VideoAwardFestival festival = null;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof VideoAwardType))
            return false;

        VideoAwardType o = (VideoAwardType) other;
        if(o.id != id) return false;
        if(o.festival == null) {
            if(festival != null) return false;
        } else if(!o.festival.equals(festival)) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 0;
        hashCode = hashCode * 31 + id;
        hashCode = hashCode * 31 + (festival == null ? 1237 : festival.hashCode());
        return hashCode;
    }

    public VideoAwardType clone() {
        try {
            VideoAwardType clone = (VideoAwardType)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}