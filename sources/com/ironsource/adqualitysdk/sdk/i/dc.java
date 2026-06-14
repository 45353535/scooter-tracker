package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class dc extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static cp.e m6146(List<Object> list) {
        return new cp.e((List) cz.m6139(list, 0, List.class), ((Integer) cz.m6139(list, 1, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m6147(List<Object> list) {
        Object objM6139;
        Class<?> cls;
        ho hoVar;
        Object objM61392;
        ho hoVar2;
        Object objM61393;
        int size = list.size();
        Object objM61394 = null;
        Class<?> cls2 = null;
        if (size != 2) {
            if (size == 3) {
                if (list.get(0) instanceof Class) {
                    cls = (Class) cz.m6139(list, 0, Class.class);
                    if (list.get(1) instanceof ho) {
                        hoVar2 = (ho) cz.m6139(list, 1, ho.class);
                        objM61393 = cz.m6139(list, 2, Object.class);
                    } else {
                        objM6139 = cz.m6139(list, 1, Object.class);
                        hoVar = (ho) cz.m6139(list, 2, ho.class);
                    }
                } else {
                    objM61394 = cz.m6139(list, 0, Object.class);
                    cls = objM61394.getClass();
                    hoVar2 = (ho) cz.m6139(list, 1, ho.class);
                    objM61393 = cz.m6139(list, 2, Object.class);
                }
                Class<?> cls3 = cls;
                objM61392 = objM61393;
                hoVar = hoVar2;
                objM6139 = objM61394;
                cls2 = cls3;
            } else if (size != 4) {
                hoVar = null;
                objM61392 = null;
                objM6139 = null;
            } else {
                cls2 = (Class) cz.m6139(list, 0, Class.class);
                Object objM61395 = cz.m6139(list, 1, Object.class);
                ho hoVar3 = (ho) cz.m6139(list, 2, ho.class);
                objM61392 = cz.m6139(list, 3, Object.class);
                hoVar = hoVar3;
                objM6139 = objM61395;
            }
            hu.m6637().m6639();
            return hz.m6732(cls2, objM6139, hoVar, objM61392);
        }
        if (list.get(0) instanceof Class) {
            cls = (Class) cz.m6139(list, 0, Class.class);
            objM6139 = null;
        } else {
            Object objM61396 = cz.m6139(list, 0, Object.class);
            if (objM61396 != null) {
                objM6139 = objM61396;
                cls = objM61396.getClass();
            } else {
                objM6139 = objM61396;
                cls = null;
            }
        }
        hoVar = (ho) cz.m6139(list, 1, ho.class);
        cls2 = cls;
        objM61392 = null;
        hu.m6637().m6639();
        return hz.m6732(cls2, objM6139, hoVar, objM61392);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m6148(List<Object> list) {
        Object objM6139;
        ho hoVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object objM61392 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) cz.m6139(list, 0, Class.class);
                objM6139 = null;
            } else {
                objM6139 = cz.m6139(list, 0, Object.class);
                if (objM6139 != null) {
                    cls2 = objM6139.getClass();
                }
            }
            hoVar = (ho) cz.m6139(list, 1, ho.class);
        } else if (size != 3) {
            hoVar = null;
            objM6139 = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) cz.m6139(list, 0, Class.class);
                if (list.get(1) instanceof ho) {
                    hoVar = (ho) cz.m6139(list, 1, ho.class);
                } else {
                    objM61392 = cz.m6139(list, 1, Object.class);
                    hoVar = (ho) cz.m6139(list, 2, ho.class);
                }
            } else {
                objM61392 = cz.m6139(list, 0, Object.class);
                cls = objM61392.getClass();
                hoVar = (ho) cz.m6139(list, 1, ho.class);
            }
            Object obj = objM61392;
            cls2 = cls;
            objM6139 = obj;
        }
        hu.m6637().m6639();
        return hz.m6735(cls2, objM6139, hoVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<hv> m6153(final du duVar, final cq cqVar, List<Object> list) {
        Object objM6139 = cz.m6139(list, 0, Object.class);
        final cp cpVar = (cp) cz.m6139(list, 1, cp.class);
        final List<Object> listM6141 = cz.m6141(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m6637().m6639().m6741(objM6139, cpVar.m5921(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo6154(hv hvVar) {
                return cpVar.m5920().m5903(hvVar, duVar, cqVar, listM6141);
            }
        }));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m6150(du duVar, cq cqVar, List<Object> list) {
        hv hvVarM6152 = m6152(duVar, cqVar, list);
        if (hvVarM6152 != null) {
            return hvVarM6152.mo6642();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6149(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hu.m6637().m6639().m6739((Class) cz.m6139(list, 0, Class.class), (String) cz.m6139(list, 1, String.class));
        }
        Object objM6139 = cz.m6139(list, 0, Object.class);
        if (list.get(1) instanceof List) {
            return hu.m6637().m6639().m6744(objM6139, new JSONArray((Collection) cz.m6139(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hu.m6637().m6639().m6744(objM6139, (JSONArray) cz.m6139(list, 1, JSONArray.class));
        }
        return hu.m6637().m6639().m6743(objM6139, (String) cz.m6139(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hv<T> m6152(final du duVar, final cq cqVar, List<Object> list) {
        Object objM6139 = cz.m6139(list, 0, Object.class);
        final cp cpVar = (cp) cz.m6139(list, 1, cp.class);
        final List<Object> listM6141 = cz.m6141(list, 2);
        if (cpVar == null) {
            return null;
        }
        return hu.m6637().m6639().m6738(objM6139, cpVar.m5921(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo6154(hv hvVar) {
                return cpVar.m5920().m5903(hvVar, duVar, cqVar, listM6141);
            }
        }));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<Object> m6151(du duVar, cq cqVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (hv hvVar : m6153(duVar, cqVar, list)) {
            if (hvVar != null) {
                arrayList.add(hvVar.mo6642());
            }
        }
        return arrayList;
    }
}
