package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.my.target.a3;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f59443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f59444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.b f59445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnClickListener f59447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f59448f;

    public interface a {
        void a(Context context);
    }

    public d(c cVar, MenuFactory menuFactory, a3.b bVar) {
        this.f59443a = cVar;
        this.f59445c = bVar;
        if (cVar == null) {
            this.f59444b = null;
            this.f59447e = null;
            this.f59446d = null;
            return;
        }
        List listA = cVar.a();
        if (listA == null || listA.isEmpty()) {
            this.f59444b = null;
        } else {
            this.f59444b = f.a(listA, menuFactory == null ? new q1() : menuFactory);
        }
        this.f59446d = cVar.b();
        this.f59447e = new View.OnClickListener() { // from class: k5.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86135b.a(view);
            }
        };
    }

    public static d a(c cVar) {
        return a(cVar, null, null);
    }

    public static d a(c cVar, MenuFactory menuFactory, a3.b bVar) {
        return new d(cVar, menuFactory, bVar);
    }

    public final /* synthetic */ void a(View view) {
        a(view.getContext());
    }

    public void a(i iVar, a aVar) {
        if (this.f59443a == null) {
            a(iVar);
            return;
        }
        f fVar = this.f59444b;
        if (fVar != null) {
            fVar.a(aVar);
        }
        this.f59448f = new WeakReference(iVar);
        iVar.setVisibility(0);
        iVar.setOnClickListener(this.f59447e);
        if (iVar.hasImage()) {
            return;
        }
        ImageData imageDataC = this.f59443a.c();
        Bitmap bitmap = imageDataC.getBitmap();
        if (bitmap != null) {
            iVar.setImageBitmap(bitmap);
        } else {
            a3.a(imageDataC, iVar, this.f59445c);
        }
    }

    public void a() {
        f fVar = this.f59444b;
        if (fVar != null) {
            fVar.a((a) null);
        }
        WeakReference weakReference = this.f59448f;
        i iVar = weakReference != null ? (i) weakReference.get() : null;
        if (iVar == null) {
            return;
        }
        c cVar = this.f59443a;
        if (cVar != null) {
            a3.a(cVar.c(), iVar);
        }
        a(iVar);
        this.f59448f.clear();
        this.f59448f = null;
    }

    public void a(Context context) {
        f fVar = this.f59444b;
        if (fVar == null) {
            String str = this.f59446d;
            if (str != null) {
                y3.a(str, context);
                return;
            }
            return;
        }
        if (fVar.b()) {
            return;
        }
        this.f59444b.a(context);
    }

    public void a(i iVar) {
        iVar.setImageBitmap(null);
        iVar.setImageDrawable(null);
        iVar.setVisibility(8);
        iVar.setOnClickListener(null);
    }
}
