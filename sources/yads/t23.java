package yads;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f116042a;

    public final void a() {
        this.f116042a = null;
        ArrayList arrayList = u23.f116470b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f116042a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
