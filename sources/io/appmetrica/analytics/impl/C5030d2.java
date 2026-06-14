package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5030d2 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f76999a;

    public C5030d2() {
        this(new D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5107g2 fromModel(@NonNull C5004c2 c5004c2) {
        C5107g2 c5107g2 = new C5107g2();
        c5107g2.f77202a = new C5081f2[c5004c2.f76940a.size()];
        int i10 = 0;
        int i11 = 0;
        for (PermissionState permissionState : c5004c2.f76940a) {
            C5081f2[] c5081f2Arr = c5107g2.f77202a;
            C5081f2 c5081f2 = new C5081f2();
            c5081f2.f77144a = permissionState.name;
            c5081f2.f77145b = permissionState.granted;
            c5081f2Arr[i11] = c5081f2;
            i11++;
        }
        F2 f22 = c5004c2.f76941b;
        if (f22 != null) {
            c5107g2.f77203b = this.f76999a.fromModel(f22);
        }
        c5107g2.f77204c = new String[c5004c2.f76942c.size()];
        Iterator it = c5004c2.f76942c.iterator();
        while (it.hasNext()) {
            c5107g2.f77204c[i10] = (String) it.next();
            i10++;
        }
        return c5107g2;
    }

    public C5030d2(D2 d22) {
        this.f76999a = d22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5004c2 toModel(@NonNull C5107g2 c5107g2) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            C5081f2[] c5081f2Arr = c5107g2.f77202a;
            if (i11 >= c5081f2Arr.length) {
                break;
            }
            C5081f2 c5081f2 = c5081f2Arr[i11];
            arrayList.add(new PermissionState(c5081f2.f77144a, c5081f2.f77145b));
            i11++;
        }
        C5055e2 c5055e2 = c5107g2.f77203b;
        F2 model = c5055e2 != null ? this.f76999a.toModel(c5055e2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c5107g2.f77204c;
            if (i10 < strArr.length) {
                arrayList2.add(strArr[i10]);
                i10++;
            } else {
                return new C5004c2(arrayList, model, arrayList2);
            }
        }
    }
}
