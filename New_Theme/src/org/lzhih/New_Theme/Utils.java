package org.lzhih.New_Theme;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

public class Utils
{
	private static int sTheme;

	public final static int THEME_DEFAULT = 0;
	public final static int THEME_WHITE = 1;
	public final static int THEME_BLUE = 2;

	/**
	 * Set the theme of the Activity, and restart it by creating a new Activity
	 * of the same type.
	 */
	public static void changeToTheme(Activity activity, int theme)
	{
		sTheme = theme;
		activity.finish();

		activity.startActivity(new Intent(activity, activity.getClass()));
	}

	public static void onActivityCreateSetTheme(Activity activity)
	{
		switch (sTheme)
		{
		default:break;
		case 1:
		  activity.setTheme(R.style.App_Theme);
		  
			break;
//			case 2:
//			activity.setTheme(R.style.Theme_Translucent2);
//			break;
		}
	}
}
