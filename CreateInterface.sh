#!/bin/bash

gdbus introspect --system --dest $1 --object-path $2 --xml --recurse | sed -e '/DOCTYPE/d' -e '/introspect.dtd/d' > $1.xml
#gdbus introspect --system --dest $1 --object-path $2 --xml  > $1.xml


CreateInterface --system  --no-ignore-builtin --create-files $1.xml