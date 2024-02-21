// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineReplaceRecordWithInfoResponseJsonConverter))]
    public class G2engineReplaceRecordWithInfoResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WithInfo Value { get; set; }
    }

    public class G2engineReplaceRecordWithInfoResponseJsonConverter : JsonConverter<G2engineReplaceRecordWithInfoResponse>
    {
        public override G2engineReplaceRecordWithInfoResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineReplaceRecordWithInfoResponse { Value = JsonSerializer.Deserialize<WithInfo>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineReplaceRecordWithInfoResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WithInfo>(writer, value.Value, options);
        }
    }
}
