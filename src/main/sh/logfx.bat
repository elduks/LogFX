@echo off
set DIR=%~dp0
set VM_OPTIONS="-splash:%DIR%/lofx-logo.png"
"%DIR%\java" %VM_OPTIONS% -m com.athaydes.logfx/com.athaydes.logfx.LogFX %* && exit 0
