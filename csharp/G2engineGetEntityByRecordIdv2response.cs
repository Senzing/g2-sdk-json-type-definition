// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineGetEntityByRecordIdv2responseJsonConverter))]
    public class G2engineGetEntityByRecordIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Entity Value { get; set; }
    }

    public class G2engineGetEntityByRecordIdv2responseJsonConverter : JsonConverter<G2engineGetEntityByRecordIdv2response>
    {
        public override G2engineGetEntityByRecordIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineGetEntityByRecordIdv2response { Value = JsonSerializer.Deserialize<Entity>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineGetEntityByRecordIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Entity>(writer, value.Value, options);
        }
    }
}
