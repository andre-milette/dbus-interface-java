package org.freedesktop;
import org.freedesktop.dbus.DBusInterface;
public interface timedate1 extends DBusInterface
{

  public void SetTime(long a, boolean b, boolean c);
  public void SetTimezone(String a, boolean b);
  public void SetLocalRTC(boolean a, boolean b, boolean c);
  public void SetNTP(boolean a, boolean b);

}
