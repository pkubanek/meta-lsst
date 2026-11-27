SUMMARY = "C++ Schema Registry Client Library"
HOMEPAGE = "https://github.com/confluentinc"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/confluentinc/libschemaregistry;protocol=https;branch=master \
    file://0001-fix-jsontest.patch \
    file://0002-gtest.patch \
    file://0003-fix-avro-cpp-target.patch \
"

# Modify these as desired
PV = "0.1.4+git"
SRCREV = "cfa0b4e2000128b62e54335e165dc1f706fa5ca3"

S = "${WORKDIR}/git"

DEPENDS = "librdkafka openssl abseil-cpp libcpr nlohmann-json googletest avro-c avro-c++ jsoncons"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DSCHEMAREGISTRY_WITH_RULES=off -DSCHEMAREGISTRY_WITH_PROTOBUF=off"
