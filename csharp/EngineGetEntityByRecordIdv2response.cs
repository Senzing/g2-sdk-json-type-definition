// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EngineGetEntityByRecordIdv2responseJsonConverter))]
    public class EngineGetEntityByRecordIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Entity Value { get; set; }
    }

    public class EngineGetEntityByRecordIdv2responseJsonConverter : JsonConverter<EngineGetEntityByRecordIdv2response>
    {
        public override EngineGetEntityByRecordIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineGetEntityByRecordIdv2response { Value = JsonSerializer.Deserialize<Entity>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineGetEntityByRecordIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Entity>(writer, value.Value, options);
        }
    }
}
