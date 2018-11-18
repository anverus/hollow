package com.netflix.vms.transformer.hollowoutput;

import com.netflix.hollow.core.write.objectmapper.HollowPrimaryKey;

@HollowPrimaryKey(fields="downloadableId")
public class WmDrmKey implements Cloneable {

    public DownloadableId downloadableId = null;
    public DrmKeyString contentPackagerPublicKey = null;
    public DrmKeyString encryptedContentKey = null;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof WmDrmKey))
            return false;

        WmDrmKey o = (WmDrmKey) other;
        if(o.downloadableId == null) {
            if(downloadableId != null) return false;
        } else if(!o.downloadableId.equals(downloadableId)) return false;
        if(o.contentPackagerPublicKey == null) {
            if(contentPackagerPublicKey != null) return false;
        } else if(!o.contentPackagerPublicKey.equals(contentPackagerPublicKey)) return false;
        if(o.encryptedContentKey == null) {
            if(encryptedContentKey != null) return false;
        } else if(!o.encryptedContentKey.equals(encryptedContentKey)) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 31 + (downloadableId == null ? 1237 : downloadableId.hashCode());
        hashCode = hashCode * 31 + (contentPackagerPublicKey == null ? 1237 : contentPackagerPublicKey.hashCode());
        hashCode = hashCode * 31 + (encryptedContentKey == null ? 1237 : encryptedContentKey.hashCode());
        return hashCode;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("WmDrmKey{");
        builder.append("downloadableId=").append(downloadableId);
        builder.append(",contentPackagerPublicKey=").append(contentPackagerPublicKey);
        builder.append(",encryptedContentKey=").append(encryptedContentKey);
        builder.append("}");
        return builder.toString();
    }

    public WmDrmKey clone() {
        try {
            WmDrmKey clone = (WmDrmKey)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private long __assigned_ordinal = -1;
}