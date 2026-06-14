package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.V5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4326g5 f42032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W5 f42033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lb f42034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4634y7 f42035e = Ib.U().i();

    public X5(Context context, C4326g5 c4326g5, W5 w52, Lb lb2) {
        this.f42031a = context;
        this.f42032b = c4326g5;
        this.f42033c = w52;
        this.f42034d = lb2;
    }

    public void b(C4652z8 c4652z8) throws Exception {
        if (c4652z8.exists()) {
            ArrayList<C4652z8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c4652z8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c4652z8) || !c4652z8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f42034d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C4652z8 c4652z8) throws Exception {
        if (c4652z8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c4652z8, this.f42034d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C4652z8 c4652z8) throws Exception {
        if (c4652z8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c4652z8);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(C4652z8 c4652z8, String str, int i10, int i11, Lc lc2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(V5.a.f41877a);
        }
        if (this.f42035e.a(this.f42032b.a()) <= 0) {
            throw new Exception(C4274d4.A);
        }
        if (!X3.h(this.f42031a)) {
            throw new Exception(C4274d4.C);
        }
        this.f42033c.a(c4652z8.getPath(), new a(lc2));
        if (!c4652z8.exists()) {
            this.f42032b.a(c4652z8, str, i10, i11, this.f42033c);
            return;
        }
        Message message = new Message();
        message.obj = c4652z8;
        message.what = 1015;
        this.f42033c.sendMessage(message);
    }

    class a implements Lc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lc f42036a;

        /* JADX INFO: renamed from: com.ironsource.X5$a$a, reason: collision with other inner class name */
        class C0441a extends JSONObject {
            C0441a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(Lc lc2) {
            this.f42036a = lc2;
        }

        @Override // com.ironsource.Lc
        public void a(C4652z8 c4652z8) {
            this.f42036a.a(c4652z8);
            try {
                X5.this.f42034d.a(c4652z8.getName(), new C0441a());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Lc
        public void a(C4652z8 c4652z8, C4516r8 c4516r8) {
            this.f42036a.a(c4652z8, c4516r8);
        }
    }

    public void a(C4652z8 c4652z8) throws Exception {
        if (c4652z8.exists()) {
            if (c4652z8.delete()) {
                this.f42034d.a(c4652z8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C4652z8 c4652z8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c4652z8.exists()) {
                if (!this.f42034d.b(c4652z8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
