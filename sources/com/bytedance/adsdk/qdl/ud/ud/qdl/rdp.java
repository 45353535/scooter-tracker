package com.bytedance.adsdk.qdl.ud.ud.qdl;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rdp extends yt {
    public rdp() {
        super(com.bytedance.adsdk.qdl.ud.mml.lnr.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl = this.qdl.qdl(map);
        Object objQdl2 = this.f15978ud.qdl(map);
        return (objQdl == null && objQdl2 == null) ? Boolean.FALSE : (objQdl != null || objQdl2 == null) ? (objQdl == null || objQdl2 != null) ? ((objQdl instanceof Number) && (objQdl2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud.qdl((Number) objQdl, (Number) objQdl2)) : Boolean.valueOf(!objQdl.equals(objQdl2)) : Boolean.TRUE : Boolean.TRUE;
    }
}
