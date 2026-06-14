package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f82513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f82514b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f82515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82516d;

    public b(ArrayList arrayList) {
        this.f82513a = arrayList;
        this.f82515c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i10++;
            arrayList.add(new a(i10, line));
        }
    }

    public boolean a() {
        return this.f82516d < this.f82515c;
    }

    public a b() {
        int i10 = this.f82516d;
        if (i10 < this.f82514b || i10 >= this.f82515c) {
            return null;
        }
        ArrayList arrayList = this.f82513a;
        this.f82516d = i10 + 1;
        return (a) arrayList.get(i10);
    }

    public void d() {
        this.f82516d--;
    }
}
