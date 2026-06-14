package yads;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f118645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f118648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f118649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f118650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f118651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f118652h;

    public zf0(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f118646b = str;
        this.f118647c = "".equals(str2) ? null : str2;
        this.f118648d = j10;
        this.f118649e = j11;
        this.f118650f = j12;
        this.f118651g = j13;
        this.f118652h = list;
    }

    public static List a(cr crVar) {
        List list = crVar.f109530h;
        if (list != null) {
            return list;
        }
        Map map = crVar.f109529g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new bz0((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static zf0 a(ag0 ag0Var) throws IOException {
        if (bg0.a(ag0Var) == 538247942) {
            String str = new String(bg0.a(ag0Var, bg0.b(ag0Var)), "UTF-8");
            String str2 = new String(bg0.a(ag0Var, bg0.b(ag0Var)), "UTF-8");
            long jB = bg0.b(ag0Var);
            long jB2 = bg0.b(ag0Var);
            long jB3 = bg0.b(ag0Var);
            long jB4 = bg0.b(ag0Var);
            int iA = bg0.a(ag0Var);
            if (iA >= 0) {
                List arrayList = iA == 0 ? Collections.EMPTY_LIST : new ArrayList();
                int i10 = 0;
                while (i10 < iA) {
                    arrayList.add(new bz0(new String(bg0.a(ag0Var, bg0.b(ag0Var)), "UTF-8").intern(), new String(bg0.a(ag0Var, bg0.b(ag0Var)), "UTF-8").intern()));
                    i10++;
                    str = str;
                    str2 = str2;
                    jB = jB;
                }
                return new zf0(str, str2, jB, jB2, jB3, jB4, arrayList);
            }
            throw new IOException(he2.a("readHeaderList size=", iA));
        }
        throw new IOException();
    }

    public final cr a(byte[] bArr) {
        cr crVar = new cr();
        crVar.f109523a = bArr;
        crVar.f109524b = this.f118647c;
        crVar.f109525c = this.f118648d;
        crVar.f109526d = this.f118649e;
        crVar.f109527e = this.f118650f;
        crVar.f109528f = this.f118651g;
        List<bz0> list = this.f118652h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (bz0 bz0Var : list) {
            treeMap.put(bz0Var.f109154a, bz0Var.f109155b);
        }
        crVar.f109529g = treeMap;
        crVar.f109530h = DesugarCollections.unmodifiableList(this.f118652h);
        return crVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            bg0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.f118646b.getBytes("UTF-8");
            bg0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.f118647c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            bg0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            bg0.a(bufferedOutputStream, this.f118648d);
            bg0.a(bufferedOutputStream, this.f118649e);
            bg0.a(bufferedOutputStream, this.f118650f);
            bg0.a(bufferedOutputStream, this.f118651g);
            List<bz0> list = this.f118652h;
            if (list != null) {
                bg0.a(bufferedOutputStream, list.size());
                for (bz0 bz0Var : list) {
                    byte[] bytes3 = bz0Var.f109154a.getBytes("UTF-8");
                    bg0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = bz0Var.f109155b.getBytes("UTF-8");
                    bg0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                bg0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z10 = rj3.f115467a;
            boolean z11 = lb1.f113032a;
            return false;
        }
    }
}
