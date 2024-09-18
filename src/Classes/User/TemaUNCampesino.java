package Classes.User;

import com.formdev.flatlaf.FlatLightLaf;

public class TemaUNCampesino
	extends FlatLightLaf
{
	public static final String NAME = "TemaUNCampesino";

	public static boolean setup() {
		return setup( new TemaUNCampesino() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, TemaUNCampesino.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
