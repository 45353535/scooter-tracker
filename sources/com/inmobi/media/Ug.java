package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.Ug;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ug {
    public static void a(Sg publisherNativeViewData, final Function1 onClick) {
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        publisherNativeViewData.f37729a.getParentView().setOnClickListener(new View.OnClickListener() { // from class: w3.t4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ug.a(onClick, view);
            }
        });
        View titleView = publisherNativeViewData.f37729a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new View.OnClickListener() { // from class: w3.u4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.b(onClick, view);
                }
            });
        }
        View descriptionView = publisherNativeViewData.f37729a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new View.OnClickListener() { // from class: w3.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.c(onClick, view);
                }
            });
        }
        ImageView iconView = publisherNativeViewData.f37729a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: w3.w4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.d(onClick, view);
                }
            });
        }
        View ctaView = publisherNativeViewData.f37729a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new View.OnClickListener() { // from class: w3.x4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.e(onClick, view);
                }
            });
        }
        View advertiserView = publisherNativeViewData.f37729a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new View.OnClickListener() { // from class: w3.y4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.f(onClick, view);
                }
            });
        }
        View ratingView = publisherNativeViewData.f37729a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new View.OnClickListener() { // from class: w3.z4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.g(onClick, view);
                }
            });
        }
        View view = publisherNativeViewData.f37731c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: w3.a5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ug.h(onClick, view2);
                }
            });
        }
    }

    public static final void b(Function1 function1, View view) {
        function1.invoke((short) 3);
    }

    public static final void c(Function1 function1, View view) {
        function1.invoke((short) 4);
    }

    public static final void d(Function1 function1, View view) {
        function1.invoke((short) 5);
    }

    public static final void e(Function1 function1, View view) {
        function1.invoke((short) 6);
    }

    public static final void f(Function1 function1, View view) {
        function1.invoke((short) 9);
    }

    public static final void g(Function1 function1, View view) {
        function1.invoke((short) 8);
    }

    public static final void h(Function1 function1, View view) {
        function1.invoke((short) 7);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke((short) 2);
    }
}
