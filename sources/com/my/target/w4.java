package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.b5;
import com.my.target.d;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w4 implements b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.a f61000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4 f61001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f61002c;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f61003a;

        public a(c cVar) {
            this.f61003a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w4.this.a(view.getContext(), this.f61003a);
        }
    }

    public class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f61005a;

        public b(com.my.target.b bVar) {
            this.f61005a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            w4.this.f61000a.a(this.f61005a, context);
        }
    }

    public w4(x4 x4Var, b5.a aVar) {
        this.f61001b = x4Var;
        this.f61000a = aVar;
    }

    public static w4 a(Context context, b5.a aVar) {
        return new w4(new x4(context), aVar);
    }

    public final /* synthetic */ void b(l4 l4Var, View view) {
        this.f61000a.b(l4Var, view.getContext());
    }

    @Override // com.my.target.b5
    public void destroy() {
    }

    @Override // com.my.target.b5
    public View getCloseButton() {
        return this.f61001b.getCloseButton();
    }

    @Override // com.my.target.b5
    public View j() {
        return this.f61001b;
    }

    @Override // com.my.target.b5
    public void pause() {
    }

    @Override // com.my.target.b5
    public void resume() {
    }

    @Override // com.my.target.b5
    public void stop() {
    }

    public void a(final l4 l4Var) {
        this.f61001b.a(l4Var.Q(), l4Var.R(), l4Var.M());
        this.f61001b.setAgeRestrictions(l4Var.c());
        this.f61001b.getImageView().setOnClickListener(new View.OnClickListener() { // from class: k5.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86133b.a(l4Var, view);
            }
        });
        this.f61001b.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: k5.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86141b.b(l4Var, view);
            }
        });
        a((com.my.target.b) l4Var);
        this.f61000a.a(l4Var, this.f61001b);
    }

    public final /* synthetic */ void a(l4 l4Var, View view) {
        this.f61000a.a(l4Var, null, 1, view.getContext());
    }

    public void a(Context context, c cVar) {
        f fVar = this.f61002c;
        if (fVar == null || !fVar.b()) {
            f fVar2 = this.f61002c;
            if (fVar2 == null) {
                y3.a(cVar.b(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    private void a(com.my.target.b bVar) {
        c cVarA = bVar.a();
        if (cVarA == null) {
            return;
        }
        this.f61001b.a(cVarA, new a(cVarA));
        List listA = cVarA.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new q1());
        this.f61002c = fVarA;
        fVarA.a(new b(bVar));
    }
}
