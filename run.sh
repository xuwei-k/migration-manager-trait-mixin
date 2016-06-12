#!/usr/bin/env bash

set -e
set -x

rm -rf $HOME/.ivy2/cache/com.example/
rm -rf $HOME/.ivy2/local/
cd library
sbt foldableV1/publishLocal foldableV2/mimaReportBinaryIssues foldableV2/publishLocal
cd ..
sbt clean update sampleMain/run
