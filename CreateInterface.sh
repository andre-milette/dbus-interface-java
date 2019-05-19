#!/bin/bash

gdbus introspect --system --dest $1 --object-path $2 --xml | sed -e '/DOCTYPE/d' -e '/introspect.dtd/d' > $1.xml
#gdbus introspect --session --dest $1 --object-path $2 --xml  > $1.xml
#gdbus introspect --system --dest org.freedesktop.timedate1 --object-path /org/freedesktop/timedate1


CreateInterface --system --create-files $1.xml