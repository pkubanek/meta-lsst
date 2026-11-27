SUMMARY = "A C++, header-only library for constructing JSON and JSON-like data formats."
DESCRIPTION = "A C++, header-only library for constructing JSON and JSON-like data formats."
HOMEPAGE = "https://github.com/danielaparker/jsoncons"
SECTION = "libs"
LICENSE = "BSL-1.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=6ee7f7ed2001e4cde4679fdb8926f820"

SRC_URI = "git://github.com/danielaparker/jsoncons;protocol=https;branch=master"
SRCREV = "bcb44594c50c495ee1e690602cdd71455942ad0e"

DEPENDS = ""

inherit cmake

S = "${WORKDIR}/git"

PACKAGECONFIG ??= ""
PACKAGECONFIG[tests] = "-DJSONCONS_BUILD_TESTS=ON,-DJSONCONS_BUILD_TESTS=OFF"
