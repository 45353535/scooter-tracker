package com.ktwapps.speedometer;

import a5.i;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import t4.a;
import x4.k;
import x4.x;
import y4.j;

/* JADX INFO: loaded from: classes10.dex */
public class History extends AppCompatActivity implements a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a5.b f46013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    t4.a f46014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    j f46015e;

    class a extends OnBackPressedCallback {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            History.this.G();
        }
    }

    class b extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f46017a;

        b(GridLayoutManager gridLayoutManager) {
            this.f46017a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (History.this.f46014d.e().get(i10) instanceof String) {
                return this.f46017a.getSpanCount();
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.f46015e.e() == 1) {
            this.f46015e.h(0);
            this.f46014d.g();
        } else {
            setResult(-1);
            finish();
        }
    }

    private PopupMenu H(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view, 48);
        popupMenu.inflate(R.menu.menu_history_item);
        return popupMenu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(int i10, MenuItem menuItem) {
        v4.b bVar = (v4.b) this.f46014d.e().get(i10);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_delete) {
            Q(bVar);
            return true;
        }
        if (itemId != R.id.menu_edit) {
            return true;
        }
        R(bVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        int i10 = insets.top;
        int i11 = insets.bottom;
        view.setPadding(insets.left, i10, insets.right, 0);
        this.f46013c.f3806c.setPadding(0, 0, 0, i11 + k.a(this, 24.0f));
        this.f46013c.f3806c.setClipToPadding(false);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Integer num) {
        this.f46014d.l(num.intValue());
        this.f46014d.notifyDataSetChanged();
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(List list) {
        if (list != null) {
            this.f46014d.j(list);
            this.f46014d.notifyDataSetChanged();
            invalidateOptionsMenu();
        }
        this.f46013c.f3805b.setVisibility((list == null || list.isEmpty()) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(v4.b bVar, DialogInterface dialogInterface, int i10) {
        if (bVar == null) {
            this.f46015e.c(this.f46014d.f());
            this.f46015e.h(0);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(bVar.f()));
            this.f46015e.c(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(i iVar, v4.b bVar, DialogInterface dialogInterface, int i10) {
        String strTrim = iVar.f3974b.getText().toString().trim();
        if (strTrim.isEmpty()) {
            strTrim = getResources().getString(R.string.untitled);
        }
        this.f46015e.d(strTrim, bVar.f());
    }

    private void O() {
        setSupportActionBar(this.f46013c.f3807d);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.history);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        t4.a aVar = new t4.a(this);
        this.f46014d = aVar;
        aVar.k(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, displayMetrics.widthPixels >= displayMetrics.heightPixels ? 2 : 1);
        gridLayoutManager.setSpanSizeLookup(new b(gridLayoutManager));
        this.f46013c.f3806c.setLayoutManager(gridLayoutManager);
        this.f46013c.f3806c.setAdapter(this.f46014d);
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f46013c.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.y
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f99750b.J(view, windowInsetsCompat);
                }
            });
        }
    }

    private void P() {
        j jVar = (j) new ViewModelProvider(this).get(j.class);
        this.f46015e = jVar;
        jVar.f108366a.observe(this, new Observer() { // from class: s4.w
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99733b.K((Integer) obj);
            }
        });
        this.f46015e.f108367b.observe(this, new Observer() { // from class: s4.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99741b.L((List) obj);
            }
        });
    }

    private void Q(final v4.b bVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(bVar == null ? R.string.dialog_histories_delete_message : R.string.dialog_history_delete_message);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99725b.M(bVar, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void R(final v4.b bVar) {
        final i iVarC = i.c(getLayoutInflater());
        iVarC.f3974b.setText(bVar.k());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(iVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99556b.N(iVarC, bVar, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    @Override // t4.a.b
    public void b(View view, final int i10) {
        PopupMenu popupMenuH = H(view);
        popupMenuH.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: s4.z
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f99759b.I(i10, menuItem);
            }
        });
        popupMenuH.show();
    }

    @Override // t4.a.b
    public void c(int i10) {
        if (this.f46015e.e() == 0) {
            this.f46015e.h(1);
            this.f46014d.g();
            this.f46014d.i(Integer.valueOf(((v4.b) this.f46014d.e().get(i10)).f()));
            this.f46014d.notifyDataSetChanged();
        }
    }

    @Override // t4.a.b
    public void n(int i10) {
        if (this.f46015e.e() != 0) {
            this.f46014d.i(Integer.valueOf(((v4.b) this.f46014d.e().get(i10)).f()));
        } else {
            int iF = ((v4.b) this.f46014d.e().get(i10)).f();
            Intent intent = new Intent(this, (Class<?>) HistoryDetail.class);
            intent.putExtra("id", iF);
            startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a5.b bVarC = a5.b.c(getLayoutInflater());
        this.f46013c = bVarC;
        setContentView(bVarC.getRoot());
        O();
        P();
        getOnBackPressedDispatcher().addCallback(this, new a(true));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.f46014d.e().isEmpty()) {
            return true;
        }
        if (this.f46015e.e() == 0) {
            menuInflater.inflate(R.menu.menu_history, menu);
        } else {
            menuInflater.inflate(R.menu.menu_history_remove, menu);
        }
        for (int i10 = 0; i10 < menu.size(); i10++) {
            Drawable icon = menu.getItem(i10).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(ContextCompat.getColor(this, R.color.colorPrimaryText), PorterDuff.Mode.SRC_ATOP);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_delete_mode) {
            this.f46015e.h(1);
            return true;
        }
        if (menuItem.getItemId() == R.id.menu_delete) {
            if (this.f46014d.f().isEmpty()) {
                this.f46015e.h(0);
            } else {
                Q(null);
            }
            return true;
        }
        if (menuItem.getItemId() != R.id.menu_checkbox) {
            return false;
        }
        this.f46014d.h();
        this.f46014d.notifyDataSetChanged();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        G();
        return true;
    }
}
