fun main() {
    val cameraServer = CameraServer()

    val mjpegServer = MJpegServer(object: ViewerConnectionListener {
        override fun onConnect(onFrameAvailable: CameraServer.OnFrameAvailable) {
            cameraServer.addListener(onFrameAvailable)
        }

        override fun onDisconnect(onFrameAvailable: CameraServer.OnFrameAvailable) {
            cameraServer.removeListener(onFrameAvailable)
        }
    })

    cameraServer.start()
    mjpegServer.start()
}