# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/lsst-ts/ts_cRIOcpp;protocol=https;branch=tickets/SSW-3262"

# Modify these as desired
PV = "1.17+git"
SRCREV = "f0b5ee43a6dabf65b98034df5bc476fca86595c3"

S = "${WORKDIR}/git"

DEPENDS = "spdlog yaml-cpp readline catch2"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

