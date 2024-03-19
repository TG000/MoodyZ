package com.techcircle.moodyz.constants;

import com.techcircle.moodyz.app.views.forms.Home;
import com.techcircle.moodyz.app.views.forms.Search;
import com.techcircle.moodyz.router.Route;

public class RouteConstants {
    public static final Route HOME = new Route("/", new Home());
    public static final Route SEARCH = new Route("/search", new Search());
}
