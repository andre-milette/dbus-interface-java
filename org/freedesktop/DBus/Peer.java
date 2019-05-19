package org.freedesktop.DBus;
import org.freedesktop.dbus.DBusInterface;
public interface Peer extends DBusInterface
{

  public void Ping();
  public String GetMachineId();

}
