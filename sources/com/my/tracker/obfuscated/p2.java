package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.j2;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f61768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b2 f61769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j2 f61770c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f61771d = Integer.MIN_VALUE;

    private p2(int i10, b2 b2Var) {
        this.f61768a = i10;
        this.f61769b = b2Var;
        x2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    public static p2 a(int i10, y2 y2Var, final Context context) {
        final String strG = y2Var.g();
        return new p2(i10, new b2() { // from class: com.my.tracker.obfuscated.z6
            @Override // com.my.tracker.obfuscated.b2
            public final Object a() {
                return p2.a(strG, context);
            }
        });
    }

    private boolean c() {
        return this.f61770c != null && this.f61771d >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j2 d() {
        return null;
    }

    public void b() throws Exception {
        if (c()) {
            return;
        }
        x2.a("TimeSpentRepository: initializing repository...");
        try {
            j2 j2Var = (j2) this.f61769b.a();
            this.f61770c = j2Var;
            this.f61771d = j2Var.a();
            this.f61769b = new b2() { // from class: com.my.tracker.obfuscated.y6
                @Override // com.my.tracker.obfuscated.b2
                public final Object a() {
                    return p2.d();
                }
            };
            x2.a("TimeSpentRepository: successfully initialized, current size = " + this.f61771d + ", max size = " + this.f61768a);
        } catch (Exception e10) {
            x2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e10);
            this.f61770c = null;
            this.f61771d = Integer.MIN_VALUE;
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j2 a(String str, Context context) {
        try {
            return j2.a(str, context);
        } catch (Exception e10) {
            x2.b("TimeSpentRepository: can't initialize sql database", e10);
            throw new RuntimeException(e10);
        }
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized void a(long j10, byte[] bArr) {
        try {
            if (!c()) {
                b();
            }
            if (this.f61771d >= this.f61768a) {
                try {
                    a();
                } catch (Exception e10) {
                    x2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                    throw new Exception(e10);
                }
            }
            try {
                long jA = this.f61770c.a(j10, bArr);
                this.f61771d++;
                x2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + jA + " (current db size = " + this.f61771d + ")");
            } catch (Exception e11) {
                x2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                throw new Exception(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized s2[] a(int i10) {
        s2[] s2VarArr;
        try {
            j2 j2Var = this.f61770c;
            Objects.requireNonNull(j2Var);
            j2.b bVarB = j2Var.b(i10);
            try {
                ArrayList arrayList = new ArrayList(i10);
                while (bVarB.b()) {
                    arrayList.add(new s2(bVarB.n(), bVarB.m()));
                }
                x2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                s2VarArr = arrayList.isEmpty() ? null : (s2[]) arrayList.toArray(new s2[0]);
                bVarB.close();
            } finally {
            }
        } catch (Throwable th2) {
            x2.b("TimeSpentRepository: error while reading " + i10 + " freshest tick packets", th2);
            return null;
        }
        return s2VarArr;
    }

    @Override // com.my.tracker.obfuscated.o2
    public synchronized void a(long[] jArr) {
        try {
            j2 j2Var = this.f61770c;
            Objects.requireNonNull(j2Var);
            j2Var.a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            x2.b(str);
            throw new Exception(str);
        }
    }

    private void a() throws Exception {
        int i10 = (this.f61771d - this.f61768a) + 1;
        try {
            j2 j2Var = this.f61770c;
            Objects.requireNonNull(j2Var);
            int iA = j2Var.a(i10);
            this.f61771d -= iA;
            x2.a("TimeSpentRepository: successfully deleted " + iA + "(requested = " + i10 + ") oldest tick packets from db, currentDbSize = " + this.f61771d + " (reason: need free up space for new packet)");
        } catch (Exception e10) {
            x2.b("TimeSpentRepository: something went wrong while trying to delete oldest" + i10 + " tick packets from db (reason: need free up space for new packet, maxSize = " + this.f61768a + ", current size = " + this.f61771d + "), can't store new tick packet", e10);
            throw new Exception(e10);
        }
    }
}
