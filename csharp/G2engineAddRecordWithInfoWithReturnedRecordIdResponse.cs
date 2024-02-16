// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineAddRecordWithInfoWithReturnedRecordIdResponseJsonConverter))]
    public class G2engineAddRecordWithInfoWithReturnedRecordIdResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WithInfo Value { get; set; }
    }

    public class G2engineAddRecordWithInfoWithReturnedRecordIdResponseJsonConverter : JsonConverter<G2engineAddRecordWithInfoWithReturnedRecordIdResponse>
    {
        public override G2engineAddRecordWithInfoWithReturnedRecordIdResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineAddRecordWithInfoWithReturnedRecordIdResponse { Value = JsonSerializer.Deserialize<WithInfo>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineAddRecordWithInfoWithReturnedRecordIdResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WithInfo>(writer, value.Value, options);
        }
    }
}
