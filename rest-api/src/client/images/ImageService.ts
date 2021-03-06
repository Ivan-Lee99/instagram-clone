import { ImageMeta } from "../models";

export type ImageMimeType = "png" | "jpeg"

/**
 * Image service interface description
 */
export interface ImageService {

    /**
     * Create a new image.
     *
     * @param caption The caption
     * @param userId Poster ID
     * @param data Image data
     */
    createImage(
        caption: string,
        userId: string,
        type: ImageMimeType,
        data: string | Uint8Array
    ): Promise<ImageMeta>;

    /**
     * Get image metadata.
     *
     * @param imageId The ID of the image
     */
    getImageMeta(imageId: string): Promise<ImageMeta>;

    /**
     * Get image byte data.
     *
     * @param imageId The ID of the image
     */
    getImageData(imageId: string): Promise<{ type: ImageMimeType, data: Uint8Array }>;

    /**
     * Delete an image based on ID.
     *
     * @param imageId The ID of the image
     */
    deleteImage(imageId: string): Promise<void>;
}
