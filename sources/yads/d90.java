package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j40 f109839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f109840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f109841c;

    public d90(IntegrationInspectorActivity integrationInspectorActivity, final ma1 ma1Var, LinearLayoutManager linearLayoutManager, j40 j40Var) {
        this.f109839a = j40Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.f109840b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.f109841c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        n70 n70Var = new n70();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: yads.a6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d90.a(ma1Var, view);
            }
        });
        int iA = (int) bm3.b(integrationInspectorActivity).a();
        recyclerView.setAdapter(j40Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(n70Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + iA);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke(o80.f114217a);
    }
}
