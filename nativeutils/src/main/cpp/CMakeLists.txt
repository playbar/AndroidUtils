cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11 -frtti")

   find_program(npm_EXECUTABLE NAMES npm)
    if (NOT npm_EXECUTABLE)
        message(FATAL_ERROR "Could not find npm")
    endif()
    message(STATUS  ${npm_EXECUTABLE})

add_library(native-activity SHARED
            android_native_app_glue.c
            esShader.cpp
            esShapes.cpp
            esTransform.cpp
            esUtil.cpp
            esUtil_Android.cpp
            Texture2D.cpp
            logging.cc
            main.cpp)

target_include_directories(native-activity PRIVATE
                           ${CMAKE_SOURCE_DIR}
                           )

target_link_libraries(native-activity
                      android
                      GLESv3
                      EGL
                      log)
