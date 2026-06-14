package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f23000b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f23002d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f23004f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23001c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f23003e = new HashMap();

    public l(File file, j jVar) {
        this.f22999a = file;
        this.f23000b = jVar;
        this.f23002d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized m a(String str, long j10) {
        String str2;
        m mVarA;
        try {
            a aVar = this.f23004f;
            if (aVar != null) {
                throw aVar;
            }
            h hVar = (h) this.f23002d.f22988a.get(str);
            if (hVar == null) {
                str2 = str;
                mVarA = new m(str2, j10, -1L, -9223372036854775807L, null);
            } else {
                str2 = str;
                while (true) {
                    mVarA = hVar.a(j10);
                    if (!mVarA.f22981d || mVarA.f22982e.length() == mVarA.f22980c) {
                        break;
                    }
                    a();
                }
            }
            if (!mVarA.f22981d) {
                if (this.f23001c.containsKey(str2)) {
                    return null;
                }
                this.f23001c.put(str2, mVarA);
                return mVarA;
            }
            h hVar2 = (h) this.f23002d.f22988a.get(str2);
            if (!hVar2.f22986c.remove(mVarA)) {
                throw new IllegalStateException();
            }
            int i10 = hVar2.f22984a;
            if (!mVarA.f22981d) {
                throw new IllegalStateException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File parentFile = mVarA.f22982e.getParentFile();
            long j11 = mVarA.f22979b;
            Pattern pattern = m.f23005g;
            File file = new File(parentFile, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
            m mVar = new m(mVarA.f22978a, mVarA.f22979b, mVarA.f22980c, jCurrentTimeMillis, file);
            if (!mVarA.f22982e.renameTo(file)) {
                throw new a("Renaming of " + mVarA.f22982e + " to " + file + " failed.");
            }
            hVar2.f22986c.add(mVar);
            ArrayList arrayList = (ArrayList) this.f23003e.get(mVarA.f22978a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j jVar = (j) arrayList.get(size);
                    jVar.f22995a.remove(mVarA);
                    jVar.f22996b -= mVarA.f22980c;
                    jVar.f22995a.add(mVar);
                    jVar.f22996b += mVar.f22980c;
                    jVar.a(this, 0L);
                }
            }
            j jVar2 = this.f23000b;
            jVar2.f22995a.remove(mVarA);
            jVar2.f22996b -= mVarA.f22980c;
            jVar2.f22995a.add(mVar);
            jVar2.f22996b += mVar.f22980c;
            jVar2.a(this, 0L);
            return mVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f23001c.remove(mVar.f22978a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l):void");
    }

    public final void a(m mVar) {
        i iVar = this.f23002d;
        String str = mVar.f22978a;
        h hVarA = (h) iVar.f22988a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f22986c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f23003e.get(mVar.f22978a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f22995a.add(mVar);
                jVar.f22996b += mVar.f22980c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f23000b;
        jVar2.f22995a.add(mVar);
        jVar2.f22996b += mVar.f22980c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z10) throws Throwable {
        h hVar = (h) this.f23002d.f22988a.get(gVar.f22978a);
        if (hVar == null || !hVar.f22986c.remove(gVar)) {
            return;
        }
        gVar.f22982e.delete();
        if (z10 && hVar.f22986c.isEmpty()) {
            i iVar = this.f23002d;
            h hVar2 = (h) iVar.f22988a.remove(hVar.f22985b);
            if (hVar2 != null) {
                if (hVar2.f22986c.isEmpty()) {
                    iVar.f22989b.remove(hVar2.f22984a);
                    iVar.f22993f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f23002d.b();
        }
        ArrayList arrayList = (ArrayList) this.f23003e.get(gVar.f22978a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f22995a.remove(gVar);
                jVar.f22996b -= gVar.f22980c;
            }
        }
        j jVar2 = this.f23000b;
        jVar2.f22995a.remove(gVar);
        jVar2.f22996b -= gVar.f22980c;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f23002d.f22988a.values().iterator();
        while (it.hasNext()) {
            for (g gVar : ((h) it.next()).f22986c) {
                if (gVar.f22982e.length() != gVar.f22980c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f23002d.a();
        this.f23002d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f23002d.f22988a.get(str);
        return hVar == null ? -1L : hVar.f22987d;
    }
}
