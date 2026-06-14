package io.sentry.opentelemetry;

import io.sentry.g7;
import io.sentry.p2;
import io.sentry.p7;
import io.sentry.util.c0;
import io.sentry.util.t;
import io.sentry.util.y;
import io.sentry.v7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static void a(v7 v7Var) {
        if (y.c()) {
            Iterator it = b(v7Var).iterator();
            while (it.hasNext()) {
                v7Var.addIgnoredSpanOrigin((String) it.next());
            }
        }
    }

    private static List b(v7 v7Var) {
        p7 openTelemetryMode = v7Var.getOpenTelemetryMode();
        return p7.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : c0.a(openTelemetryMode);
    }

    public static void c(v7 v7Var, t tVar) {
        if (y.c()) {
            if (p7.AUTO.equals(v7Var.getOpenTelemetryMode())) {
                if (tVar.c("io.sentry.opentelemetry.agent.AgentMarker", p2.e())) {
                    v7Var.getLogger().c(g7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    v7Var.setOpenTelemetryMode(p7.AGENT);
                } else if (tVar.c("io.sentry.opentelemetry.agent.AgentlessMarker", p2.e())) {
                    v7Var.getLogger().c(g7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    v7Var.setOpenTelemetryMode(p7.AGENTLESS);
                } else if (tVar.c("io.sentry.opentelemetry.agent.AgentlessSpringMarker", p2.e())) {
                    v7Var.getLogger().c(g7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    v7Var.setOpenTelemetryMode(p7.AGENTLESS_SPRING);
                }
            }
        }
    }
}
