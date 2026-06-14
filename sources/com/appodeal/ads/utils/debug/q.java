package com.appodeal.ads.utils.debug;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.appodeal.ads.te;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q {
    /* JADX WARN: Can't wrap try/catch for region: R(10:10|(2:41|11)|(3:13|(9:15|(3:18|(1:20)(2:49|21)|16)|48|24|25|(1:27)(1:28)|29|(1:31)|32)(6:24|25|(0)(0)|29|(0)|32)|37)(1:33)|34|35|43|36|46|37|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        com.appodeal.ads.utils.Log.log(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:11:0x0021, B:13:0x0038, B:15:0x0054, B:16:0x005c, B:18:0x0062, B:21:0x006f, B:25:0x0080, B:29:0x008f, B:31:0x0093, B:34:0x009a, B:28:0x008d, B:24:0x007c), top: B:41:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:11:0x0021, B:13:0x0038, B:15:0x0054, B:16:0x005c, B:18:0x0062, B:21:0x006f, B:25:0x0080, B:29:0x008f, B:31:0x0093, B:34:0x009a, B:28:0x008d, B:24:0x007c), top: B:41:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList a(java.util.ArrayList r14, boolean r15) {
        /*
            java.lang.String r1 = "package_name"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r14 == 0) goto Lb9
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L11
            goto Lb9
        L11:
            java.util.Iterator r3 = r14.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r3.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r4 = "-1"
            java.lang.String r5 = "status"
            java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Exception -> L79
            java.lang.String r10 = com.appodeal.ads.z6.d(r5)     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = "capitalize(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)     // Catch: java.lang.Exception -> L79
            boolean r5 = r0.has(r1)     // Catch: java.lang.Exception -> L79
            if (r5 == 0) goto L98
            java.lang.String r5 = r0.getString(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Exception -> L79
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = ":"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L79
            r7 = 0
            java.util.List r5 = r6.j(r5, r7)     // Catch: java.lang.Exception -> L79
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Exception -> L79
            r8 = 1
            if (r6 != 0) goto L7c
            int r6 = r5.size()     // Catch: java.lang.Exception -> L79
            java.util.ListIterator r6 = r5.listIterator(r6)     // Catch: java.lang.Exception -> L79
        L5c:
            boolean r9 = r6.hasPrevious()     // Catch: java.lang.Exception -> L79
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r6.previous()     // Catch: java.lang.Exception -> L79
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L79
            int r9 = r9.length()     // Catch: java.lang.Exception -> L79
            if (r9 != 0) goto L6f
            goto L5c
        L6f:
            int r6 = r6.nextIndex()     // Catch: java.lang.Exception -> L79
            int r6 = r6 + r8
            java.util.List r5 = kotlin.collections.CollectionsKt.take(r5, r6)     // Catch: java.lang.Exception -> L79
            goto L80
        L79:
            r0 = move-exception
            r13 = r15
            goto Lb5
        L7c:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Exception -> L79
        L80:
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch: java.lang.Exception -> L79
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Exception -> L79
            int r6 = r5.length     // Catch: java.lang.Exception -> L79
            if (r6 != 0) goto L8d
            r6 = r10
            goto L8f
        L8d:
            r6 = r5[r7]     // Catch: java.lang.Exception -> L79
        L8f:
            int r7 = r5.length     // Catch: java.lang.Exception -> L79
            r9 = 2
            if (r7 < r9) goto L95
            r4 = r5[r8]     // Catch: java.lang.Exception -> L79
        L95:
            r11 = r4
            r9 = r6
            goto L9a
        L98:
            r11 = r4
            r9 = r10
        L9a:
            com.appodeal.ads.utils.debug.r r6 = new com.appodeal.ads.utils.debug.r     // Catch: java.lang.Exception -> L79
            int r7 = r2.size()     // Catch: java.lang.Exception -> L79
            int r8 = r14.indexOf(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = "ecpm"
            java.lang.String r12 = r0.getString(r4)     // Catch: java.lang.Exception -> L79
            r13 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lb4
            r2.add(r6)     // Catch: java.lang.Exception -> Lb4
        Lb1:
            r15 = r13
            goto L15
        Lb4:
            r0 = move-exception
        Lb5:
            com.appodeal.ads.utils.Log.log(r0)
            goto Lb1
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.debug.q.a(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public static final void b(Activity activity, te adRequest, final Function2 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f fVar = new f(activity, CollectionsKt.plus((Collection) a(adRequest.f14890b, true), (Iterable) a(adRequest.f14889a, false)));
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#404040"));
        linearLayout.setTag("appodeal");
        linearLayout.setClickable(true);
        EditText editText = new EditText(activity);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 56.0f, activity.getResources().getDisplayMetrics())));
        editText.setTextSize(20.0f);
        editText.setTextColor(-1);
        editText.setHint("What adunit you search for?");
        editText.setHintTextColor(Color.parseColor("#80ffffff"));
        editText.addTextChangedListener(new n(fVar));
        ListView listView = new ListView(activity);
        listView.setAdapter((ListAdapter) fVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.appodeal.ads.utils.debug.o
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                q.c(linearLayout, callback, adapterView, view, i10, j10);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.appodeal.ads.utils.debug.p
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i10, long j10) {
                return q.d(adapterView, view, i10, j10);
            }
        });
        listView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        listView.setCacheColorHint(Color.parseColor("#404040"));
        listView.setDivider(new ColorDrawable(Color.parseColor("#b3b3b3")));
        listView.setDividerHeight(1);
        linearLayout.addView(editText);
        linearLayout.addView(listView);
        activity.addContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public static final void c(LinearLayout linearLayout, Function2 function2, AdapterView adapterView, View view, int i10, long j10) {
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
        ViewParent parent = linearLayout.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(linearLayout);
        Object item = adapterView.getAdapter().getItem(i10);
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.appodeal.ads.utils.debug.DebugWaterfallItem");
        r rVar = (r) item;
        function2.invoke(Integer.valueOf(rVar.f15014g), Boolean.valueOf(rVar.f15013f));
    }

    public static final boolean d(AdapterView adapterView, View view, int i10, long j10) {
        Adapter adapter = adapterView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.appodeal.ads.utils.debug.DebugAdapter");
        f fVar = (f) adapter;
        ArrayAdapter arrayAdapter = new ArrayAdapter(fVar.getContext(), R.layout.select_dialog_item);
        arrayAdapter.add("Waterfall order");
        arrayAdapter.add("Alphabetical order");
        AlertDialog.Builder builder = new AlertDialog.Builder(fVar.getContext());
        builder.setAdapter(arrayAdapter, new b(fVar)).setTitle("Sort items");
        builder.create().show();
        return true;
    }
}
