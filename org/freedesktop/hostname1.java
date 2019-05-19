package org.freedesktop;
import org.freedesktop.dbus.DBusInterface;
public interface hostname1 extends DBusInterface
{

  public void SetHostname(String a, boolean b);
  public void SetStaticHostname(String a, boolean b);
  public void SetPrettyHostname(String a, boolean b);
  public void SetIconName(String a, boolean b);
  public void SetChassis(String a, boolean b);
  public void SetDeployment(String a, boolean b);
  public void SetLocation(String a, boolean b);

}
